package service;

import dao.ApiDAO;

// service layer
public class ApiService {

    ApiDAO dao = new ApiDAO();

    // business logic
    public void getAgeData(String name) {
        dao.callApi(name);
    }
}
