package africa.learnspace.trainee.service.traineeLoanService;

import africa.learnspace.data.dto.request.CompleteLoanApplicationRequest;
import africa.learnspace.data.dto.request.QuickDepositRequest;
import africa.learnspace.data.dto.request.SetupRepaymentPlanRequest;
import africa.learnspace.data.dto.request.ViewTraineeAccountStatementRequest;
import africa.learnspace.data.dto.response.AllLoanResponse;
import africa.learnspace.data.dto.response.SignLoanOfferResponse;
import africa.learnspace.data.dto.response.ViewLoanAccountResponse;
import africa.learnspace.data.exception.LearnSpaceException;
import africa.learnspace.data.model.trainee.TraineeLoan;

import java.util.List;

public interface TraineeLoanService {
    List<TraineeLoan> findAllTraineeLoansForAProgram(String programId);
    TraineeLoan save(TraineeLoan traineeLoan);

    AllLoanResponse signLoanOffer(String id) throws LearnSpaceException;

    AllLoanResponse quickDeposit(String id, QuickDepositRequest quickDeposit) throws LearnSpaceException;

    AllLoanResponse setUpRepaymentPlan(String loanId, SetupRepaymentPlanRequest repaymentPlanRequest) throws LearnSpaceException;

    TraineeLoan findByTraineeId(String traineeId) throws LearnSpaceException;

    ViewLoanAccountResponse viewLoanAccount(String traineeId);
}
