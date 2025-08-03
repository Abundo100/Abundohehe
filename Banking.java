public static void main(String[] args) {
    bankingClass bank = new bankingClass();
    Scanner scanner = new Scanner(System.in);
    
    boolean isAuthenticated = false;
    
    while (!isAuthenticated && bank.loginAttempts < bank.MAX_ATTEMPTS) {
        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();
        
        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();
        
        isAuthenticated = bank.verifyAccount(accNo, pin);
        
        if (isAuthenticated) {
            System.out.println("Login successful!");
           
        }
    }
    
    if (!isAuthenticated) {
        System.out.println("Your account has been temporarily locked. Please try again later.");
    }
    
    scanner.close();
}
