package in.apptonic.lerning;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

/**
 * Created by lalitkumarsonawane on 17/09/17.
 */

@Database(entities = {Task.class}, version = 1)
@TypeConverters(DateConverter.class)

public abstract class TaskDatabase extends RoomDatabase {

    public abstract TaskDao taskDao();

    public static TaskDatabase sInstance;

    public static synchronized TaskDatabase
    getDatabaseInstance(Context context){

        if (sInstance == null){

            sInstance = create(context);
        }
        return sInstance;


    }

    static TaskDatabase create (Context context){
        RoomDatabase.Builder<TaskDatabase> builder =
                Room.databaseBuilder(context.getApplicationContext(), TaskDatabase.class, Task.TABLE_NAME);
        return builder.build();
    }
}