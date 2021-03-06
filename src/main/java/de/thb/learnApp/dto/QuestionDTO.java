package de.thb.learnApp.dto;

import de.thb.learnApp.model.Answer;
import de.thb.learnApp.model.Category;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {

    @ApiModelProperty(example = "A + B")
    @NotBlank
    private String text;

    @ApiModelProperty(example = "sum of", position = 2)
    @NotBlank
    private String explanation;

    @NotBlank
    private String hash;

    private List<Answer> answers = new ArrayList<>();

    private Category category;

    public String getText() {
        return text;
    }

    public String getExplanation() {
        return explanation;
    }

    public Category getCategory() {
        return this.category;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public String getHash() {
        return hash;
    }
}
