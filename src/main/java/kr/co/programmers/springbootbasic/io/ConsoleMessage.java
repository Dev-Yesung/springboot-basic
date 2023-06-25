package kr.co.programmers.springbootbasic.io;

public final class ConsoleMessage {
    public static final String VOUCHER_PROGRAM_MENU = """
            === Voucher Program ===
            Type **exit** to exit the program.
            Type **create** to create a new voucher.
            Type **list** to list all vouchers.
                        
            Type here :\s""";
    public static final String VOUCHER_CREATION_MENU = """
                        
            === 바우처를 선택해주세요 ===
            Type **1** to create FixedAmountVoucher.
            Type **2** to create PercentAmountVoucher.
                        
            Type here :\s""";
    public static final String PERCENT_AMOUNT_ENTER_MESSAGE = """
            할인률을 입력해주세요 :\s""";
    public static final String FIXED_AMOUNT_ENTER_MESSAGE = """
            할인 가격을 입력해주세요 :\s""";
    public static final String EXIT_MESSAGE = """
                        
            프로그램을 종료합니다.
            """;
    public static final String NO_VALID_MENU = """
            올바르지 않은 메뉴 선택입니다.
                                        
            """;
    private ConsoleMessage() {
    }
}