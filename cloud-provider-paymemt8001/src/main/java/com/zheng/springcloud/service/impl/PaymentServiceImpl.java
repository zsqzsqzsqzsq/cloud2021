package com.zheng.springcloud.service.impl;

import com.zheng.springcloud.dao.PaymentDao;
import com.zheng.springcloud.entity.Payment;
import com.zheng.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
