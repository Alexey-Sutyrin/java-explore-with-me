package ru.practicum.explorewithme.compilation.dto; //a-Data fixed

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.practicum.explorewithme.event.dto.EventShortDto;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CompilationDto {

    private Long id;
    private List<EventShortDto> events;
    private Boolean pinned;
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompilationDto that = (CompilationDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(pinned, that.pinned) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pinned, title);
    }
}
