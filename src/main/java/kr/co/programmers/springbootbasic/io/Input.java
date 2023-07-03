package kr.co.programmers.springbootbasic.io;

import kr.co.programmers.springbootbasic.voucher.domain.VoucherType;

public interface Input {
    MenuCommand readMenuCommand();
    VoucherType readVoucherType();
    long readAmount();
}
