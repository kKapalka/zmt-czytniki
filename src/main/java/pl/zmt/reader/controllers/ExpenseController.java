package pl.zmt.reader.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.zmt.reader.entities.Expense;
import pl.zmt.reader.repositories.ExpenseRepository;


@RestController
@RequestMapping("/expense")
public class ExpenseController {


    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping("getall")
    public @ResponseBody
    Iterable<Expense> getAllExpenses() {
        // This returns a JSON or XML with the compressors
        return expenseRepository.findAll();
    }


}
