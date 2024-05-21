package ru.practicum.explorewithme.compilation.dto; //a-Data fixed

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateCompilationRequest {

    private List<Long> events;
    private Boolean pinned;
    @Size(min = 1, max = 50, message = "Длина должна быть от 1 до 50 символов")
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateCompilationRequest that = (UpdateCompilationRequest) o;
        return Objects.equals(pinned, that.pinned) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pinned, title);
    }
}
