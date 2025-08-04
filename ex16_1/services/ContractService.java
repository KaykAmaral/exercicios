package exercicios.ex16_1.services;

import exercicios.ex16_1.entities.Contract;
import exercicios.ex16_1.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private final OnlinePaymentService ops;

    public ContractService(OnlinePaymentService onlinePaymentService) { this.ops =
            onlinePaymentService;}

    // IDK what I do here... I don't want need fix it =\
    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue()/(double)months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = ops.interest(basicQuota, i);
            double paymentFee = ops.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + paymentFee;
            contract.getInstallment().add(new Installment(dueDate, quota));
        }
    }

}