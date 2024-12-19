public class N13_TransactionId {
    public static void main(String[] args) {

        String html = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Transactions</title>
                </head>
                <body>
                    <div>
                        <div class="button">
                            <p>Transaction Id: TXN1234</p>
                        </div>
                    </div>
                </body>
                </html>
                """;

        String transactionId = "";
        String regex = "Transaction Id: (TXN\\d+)";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(html);

        if (matcher.find()) {
            transactionId = matcher.group();
        }
        
        System.out.println(transactionId);
    }
}
