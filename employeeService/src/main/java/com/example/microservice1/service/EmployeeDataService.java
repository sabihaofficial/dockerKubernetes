package com.example.microservice1.service;

import com.example.microservice1.domain.EmployeeData;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeDataService {

//    @Autowired
//    TestDataRepository testDataRepository;
//
//
//    public TestData getTestDataById(Long id) {
//
//        Optional<TestData> data = testDataRepository.findById(id);
//        if (null == data.get()) {
//            System.out.println("No data present!!");
//        }
//        return data.get();
//    }
//
//    public List<TestData> getAllTestData() {
//
//        List<TestData> testDataSet = testDataRepository.findAll();
//        if (testDataSet.size() <= 0) {
//            System.out.println("No Test Data!!");
//        }
//        return testDataSet;
//
//    }
//
//    public void putTestData(Long id, String Name) {
//
//        TestData testData = new TestData(id, Name);
//        testDataRepository.save(testData);
//        System.out.println("Data Saved!!");
//
//    }

    public List<EmployeeData> getAllTestData(){
        EmployeeData td = new EmployeeData(1,"sabiha");
        EmployeeData td2 = new EmployeeData(2,"vakeel");
        List<EmployeeData> testData = Arrays.asList(td, td2);
        return testData;
    }

}
