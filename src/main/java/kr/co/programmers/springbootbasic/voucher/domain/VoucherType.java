package kr.co.programmers.springbootbasic.voucher.domain;

import kr.co.programmers.springbootbasic.global.exception.NoValidCommandException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public enum VoucherType {
    FIXED_AMOUNT("fixed", 1),
    PERCENT_AMOUNT("percent", 2);
    private static final Logger logger = LoggerFactory.getLogger(VoucherType.class);
    private final String type;
    private final int typeId;

    VoucherType(String type, int typeId) {
        this.type = type;
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public int getTypeId() {
        return typeId;
    }

    public static VoucherType resolveType(String input) {
        return Arrays.stream(values())
                .filter(val -> val.getType().equals(input))
                .findFirst()
                .orElseThrow(() -> {
                    logger.warn("바우처 종류 중에 {}과(와) 일치하는 바우처가 없습니다.", input);

                    return new NoValidCommandException("올바르지 않은 바우처 종류입니다.\n\n");
                });
    }

    public static VoucherType resolveTypeId(int input) {
        return Arrays.stream(values())
                .filter(val -> val.getTypeId() == input)
                .findFirst()
                .orElseThrow(() -> {
                    logger.warn("바우처 종류 ID 중에 {}과(와) 일치하는 바우처가 없습니다.", input);

                    return new NoValidCommandException("올바르지 않은 바우처 종류 ID 입니다.\n\n");
                });
    }
}
