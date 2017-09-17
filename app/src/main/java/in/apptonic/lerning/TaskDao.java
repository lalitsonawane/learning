package in.apptonic.lerning;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by lalitkumarsonawane on 17/09/17.
 */
@Dao
public interface TaskDao {

    @Query("SELECT * FROM" + Task.TABLE_NAME + "ORDER By" + Task.COMPLETE_BY_DATE)
    LiveData<List<Task>> getALLTasks();

    @Query("SELECT * FROM " + Task.TABLE_NAME + " WHERE id=:id")
    LiveData<Task> getTaskById(String id);
}
