package com.lisz.service;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lisz.entity.Account;

@Service
public class AccountSerrviceImpl extends ServiceImpl<BaseMapper<Account>, Account> implements AccountService{

}
