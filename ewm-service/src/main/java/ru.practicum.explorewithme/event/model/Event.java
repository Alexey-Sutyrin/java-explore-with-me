package ru.practicum.explorewithme.event.model; //a-Data

import lombok.*;
import ru.practicum.explorewithme.category.model.Category;
import ru.practicum.explorewithme.compilation.model.Compilation;
import ru.practicum.explorewithme.user.model.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Builder
@Entity
@Table(name = "events")
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"category", "initiator", "compilations"})
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String annotation;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    private String description;

    @Column(name = "event_date")
    private LocalDateTime eventDate;

    @ManyToOne
    @JoinColumn(name = "initiator_id", nullable = false)
    private User initiator;

    @Column(name = "is_paid")
    private Boolean isPaid;

    private String title;

    @Column(name = "loc_lat")
    private Float lat;

    @Column(name = "loc_lon")
    private Float lon;

    @Column(name = "participant_limit")
    private Integer participantLimit;

    @Column(name = "request_moderation")
    private Boolean requestModeration;

    @Column(name = "published_on")
    private LocalDateTime publishedOn;

    @Enumerated(value = EnumType.STRING)
    private EventState state;

    @Column(name = "confirmed_requests")
    private Integer confirmedRequests;

    @ManyToMany(mappedBy = "events")
    private List<Compilation> compilations;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
