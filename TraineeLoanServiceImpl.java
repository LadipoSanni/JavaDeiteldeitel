package africa.learnspace.trainee.service.traineeLoanService;

import africa.learnspace.data.dto.request.QuickDepositRequest;
import africa.learnspace.data.dto.request.SetupRepaymentPlanRequest;
import africa.learnspace.data.dto.request.ViewTraineeAccountStatementRequest;
import africa.learnspace.data.dto.response.AllLoanResponse;
import africa.learnspace.data.dto.response.ViewLoanAccountResponse;
import africa.learnspace.data.exception.LearnSpaceException;
import africa.learnspace.data.model.enums.Status;
import africa.learnspace.data.model.trainee.*;
import africa.learnspace.data.repository.TraineeLoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static africa.learnspace.data.model.enums.Status.APPROVED;

@Service
@RequiredArgsConstructor
public class TraineeLoanServiceImpl implements TraineeLoanService {
    private final TraineeLoanRepository traineeLoanRepository;

    @Override
    public List<TraineeLoan> findAllTraineeLoansForAProgram(String programId) {
        return traineeLoanRepository.findAll()
                .stream()
                .filter(traineeLoan -> traineeLoan.getProgramId().equals(programId))
                .toList();
    }

    @Override
    public TraineeLoan save(TraineeLoan traineeLoan) {
        return traineeLoanRepository.save(traineeLoan);
    }



    @Override
    public AllLoanResponse signLoanOffer(String id) throws LearnSpaceException {
        TraineeLoan findTrainee = traineeLoanRepository.findById(id).orElseThrow(()-> new LearnSpaceException("Loan not found"));

        if(!findTrainee.getTraineeLoanStatus().getStatus().equals(Status.APPROVED)) {
            throw new LearnSpaceException("Loan not approved");
        }
        findTrainee.setSigned(true);
        traineeLoanRepository.save(findTrainee);

        return AllLoanResponse.builder()
                .message("Loan Signed")
                .build();
    }


    @Override
    public ViewLoanAccountResponse viewLoanAccount(String traineeId) {
        return null;
    }

    @Override
    public AllLoanResponse quickDeposit(String id, QuickDepositRequest quickDeposit) throws LearnSpaceException {
        TraineeLoan findTrainee = traineeLoanRepository.findById(id).orElseThrow(()-> new LearnSpaceException("Loan not found"));
        if(!findTrainee.getTraineeLoanStatus().getStatus().equals(APPROVED)) {
            throw new LearnSpaceException("Loan not approved");
        }
        QuickDeposit traineeDeposit = QuickDeposit.builder()
                .paymentType(quickDeposit.getPaymentType())
                .amount(quickDeposit.getAmount())
                .accountNumber(quickDeposit.getAccountNumber())
                .build();
        findTrainee.setQuickDeposit(traineeDeposit);
        traineeLoanRepository.save(findTrainee);

        return AllLoanResponse.builder()
                .message("Quick Deposit Completed")
                .build();
    }

    @Override
    public AllLoanResponse setUpRepaymentPlan(String loanId, SetupRepaymentPlanRequest repaymentPlanRequest) throws LearnSpaceException {
        TraineeLoan findTrainee = traineeLoanRepository.findById(loanId).orElseThrow(()-> new LearnSpaceException("Loan not found"));

        RepaymentPlan traineeRepaymentPlan = RepaymentPlan.builder()
                .amount(repaymentPlanRequest.getAmount())
                .paymentType(repaymentPlanRequest.getPaymentType())
                .accountNumber(repaymentPlanRequest.getAccountNumber())
                .interval(repaymentPlanRequest.getInterval())
                .build();

        if(findTrainee.getTraineeLoanStatus().getStatus().equals(APPROVED)){

            findTrainee.setRepaymentPlan(traineeRepaymentPlan);
            traineeLoanRepository.save(findTrainee);
        } else throw new LearnSpaceException("Loan not approved");

        return AllLoanResponse.builder()
                .message("Loan Repayment Plan Set Up")
                .build();
    }
    @Override
    public TraineeLoan findByTraineeId(String traineeId) throws LearnSpaceException {
        return traineeLoanRepository.findByTraineeId(traineeId).orElseThrow(
                () -> new LearnSpaceException("trainee loan not found")
        );
    }



}
