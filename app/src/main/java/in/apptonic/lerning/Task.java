package in.apptonic.lerning;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.RoomMasterTable.TABLE_NAME;

/**
 * Created by lalitkumarsonawane on 17/09/17.
 */

@Entity(tableName = TABLE_NAME)
public class Task {

    @PrimaryKey(autoGenerate = true)

    private int Id;
    private String title;
    private String description;

}
