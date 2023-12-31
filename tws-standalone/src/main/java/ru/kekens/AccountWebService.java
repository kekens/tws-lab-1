package ru.kekens;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Класс-реализация веб-сервиса
 */
@WebService(serviceName = "AccountService")
public class AccountWebService {

    @WebMethod(operationName = "getAccounts")
    public List<Account> getAccounts(AccountsRequest accountsRequest) {
        AccountDAO dao = new AccountDAO();
        return dao.getAccountsByParams(accountsRequest.getList());
    }

}
