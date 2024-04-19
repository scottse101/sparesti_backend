package edu.ntnu.idi.stud.team10.sparesti.dto;

import edu.ntnu.idi.stud.team10.sparesti.enums.CategoryEnum;
import edu.ntnu.idi.stud.team10.sparesti.model.BudgetRow;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Data transfer object for BudgetRow entities. */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BudgetRowDto {

  private Long id;

  private String name;
  private double amount;
  private CategoryEnum category;

  /**
   * Constructor for creating a new BudgetRowDTO.
   *
   * @param budgetRow The BudgetRow entity to convert.
   */
  public BudgetRowDto(BudgetRow budgetRow) {
    this.id = budgetRow.getId();
    this.name = budgetRow.getName();
    this.amount = budgetRow.getAmount();
    this.category = budgetRow.getCategory();
  }

  /**
   * Converts the DTO to a BudgetRow entity.
   *
   * @return (BudgetRow) The BudgetRow entity.
   */
  public BudgetRow toEntity() {
    BudgetRow budgetRow = new BudgetRow();
    budgetRow.setId(id);
    budgetRow.setName(name);
    budgetRow.setAmount(amount);
    budgetRow.setCategory(category);
    return budgetRow;
  }
}