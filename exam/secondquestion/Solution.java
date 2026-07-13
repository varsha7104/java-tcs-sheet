import java.util.*;

class BankAccount {

    private String accId;
    private String accHolderName;
    private String accType;
    private String occupation;
    private KYC kyc;

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getAccId() {
        return this.accId;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccHolderName() {
        return this.accHolderName;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAccType() {
        return this.accType;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setKyc(KYC kyc) {
        this.kyc = kyc;
    }

    public KYC getKyc() {
        return this.kyc;
    }
}

class KYC {

    private String panCardNumber;
    private String accountIdentificationType;
    private String accountIdentification;
    private String status;

    public void setPanCardNumber(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    public String getPanCardNumber() {
        return this.panCardNumber;
    }

    public void setAccountIdentificationType(String accountIdentificationType) {
        this.accountIdentificationType = accountIdentificationType;
    }

    public String getAccountIdentificationType() {
        return this.accountIdentificationType;
    }

    public void setAccountIdentification(String accountIdentification) {
        this.accountIdentification = accountIdentification;
    }

    public String getAccountIdentification() {
        return this.accountIdentification;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}

public class Solution {

    public static BankAccount[] findtbankByKYC(BankAccount[] bank, String type) {

        BankAccount[] sol = new BankAccount[0];

        for (BankAccount b : bank) {

            if (b.getAccType().equalsIgnoreCase(type)
                    && b.getKyc().getStatus().equalsIgnoreCase("Lapsed")) {

                sol = Arrays.copyOf(sol, sol.length + 1);
                sol[sol.length - 1] = b;
            }
        }

        if (sol.length == 0)
            return null;

        return sol;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        if (n <= 0) {
            System.out.println("Add few more account into the bank array");
            return;
        }

        BankAccount[] b = new BankAccount[n];

        for (int i = 0; i < n; i++) {

            b[i] = new BankAccount();

            b[i].setAccId(sc.nextLine());
            b[i].setAccHolderName(sc.nextLine());
            b[i].setAccType(sc.nextLine());
            b[i].setOccupation(sc.nextLine());

            KYC k = new KYC();

            k.setPanCardNumber(sc.nextLine());
            k.setAccountIdentificationType(sc.nextLine());
            k.setAccountIdentification(sc.nextLine());
            k.setStatus(sc.nextLine());

            b[i].setKyc(k);
        }

        String type = sc.nextLine();

        BankAccount[] ans = findtbankByKYC(b, type);

        if (ans == null) {
            System.out.println("KYC Lapsed is not found");
        } else {

            for (BankAccount x : ans) {

              
                System.out.println(x.getAccHolderName());
                System.out.println(x.getAccType());
                System.out.println(x.getOccupation());
                
                System.out.println(x.getKyc().getAccountIdentificationType());
              
                System.out.println(x.getKyc().getStatus());
            }
        }

        sc.close();
    }
}