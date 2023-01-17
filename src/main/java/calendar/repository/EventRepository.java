package calendar.repository;

import calendar.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

    Optional<Event> findById(int id);


    @Modifying
    @Query("update Event e set e.isPublic =:isPublic,e.title =:title,e.time =:time,e.duration =:duration,e.location =:location,e.description =:description where e.id =:id")
    @Transactional
    int updateEvent(@Param("isPublic") boolean isPublic, @Param("title") String title
            , @Param("time") ZonedDateTime time, @Param("duration") float duration
            , @Param("location") String location, @Param("description") String description, @Param("id") int id);



    @Modifying
    @Query("update Event e set e.isPublic =:isPublic,e.location =:location,e.description =:description where e.id =:id")
    @Transactional
    int updateEventRestricted(@Param("isPublic") boolean isPublic,@Param("location") String location, @Param("description") String description, @Param("id") int id);



    @Modifying
    @Query("update Event e set e.title =:title where e.id =:id")
    @Transactional
    int updateEventTitle(@Param("title") String title,
                         @Param("id") int id);


    @Modifying
    @Query("update Event e set e.time =:time where e.id =:id")
    @Transactional
    int updateEventTime(@Param("time") ZonedDateTime time,
                        @Param("id") int id);

    @Modifying
    @Query("update Event e set e.duration =:duration where e.id =:id")
    @Transactional
    int updateEventDuration(@Param("duration") float duration,
                            @Param("id") int id);

    @Modifying
    @Query("update Event e set e.location =:location where e.id =:id")
    @Transactional
    int updateEventLocation(@Param("location") String location,
                            @Param("id") int id);

    @Modifying
    @Query("update Event e set e.description =:description where e.id =:id")
    @Transactional
    int updateEventDescription(@Param("description") String description,
                               @Param("id") int id);

    @Modifying
    @Query("update Event e set e.isPublic =:isPublic where e.id =:id")
    @Transactional
    int updateEventIsPublic(@Param("isPublic") boolean isPublic,
                            @Param("id") int id);

}
