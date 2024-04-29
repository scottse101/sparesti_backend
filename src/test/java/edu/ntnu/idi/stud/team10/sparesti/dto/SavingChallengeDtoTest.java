package edu.ntnu.idi.stud.team10.sparesti.dto;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.ntnu.idi.stud.team10.sparesti.enums.DifficultyLevel;
import edu.ntnu.idi.stud.team10.sparesti.enums.TimeInterval;
import edu.ntnu.idi.stud.team10.sparesti.model.SavingChallenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingChallengeDtoTest {

  private SavingChallengeDto savingChallengeDto;

  @BeforeEach
  public void setUp() {
    savingChallengeDto = new SavingChallengeDto();
    savingChallengeDto.setDescription("Test Saving Challenge");
    savingChallengeDto.setTargetAmount(1000.0);
    savingChallengeDto.setUsedAmount(500.0);
    savingChallengeDto.setMediaUrl("https://example.com/image.jpg");
    savingChallengeDto.setTimeInterval(TimeInterval.MONTHLY);
    savingChallengeDto.setDifficultyLevel(DifficultyLevel.MEDIUM);
    savingChallengeDto.setExpiryDate(LocalDate.now().plusMonths(1));
    savingChallengeDto.setCompleted(false);
  }

  @Test
  public void testSavingChallengeDtoFields() {
    assertEquals("Test Saving Challenge", savingChallengeDto.getDescription());
    assertEquals(1000.0, savingChallengeDto.getTargetAmount());
  }

  @Test
  public void testSavingChallengeDtoConversionToEntity() {
    SavingChallenge savingChallenge = (SavingChallenge) savingChallengeDto.toEntity();

    assertEquals("Test Saving Challenge", savingChallenge.getDescription());
    assertEquals(1000.0, savingChallenge.getTargetAmount());
  }
}