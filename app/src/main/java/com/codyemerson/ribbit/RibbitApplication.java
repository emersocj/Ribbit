package com.codyemerson.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Wizard on 1/2/2015.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
    super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "KsrIHy1LDLxVtUHkhvAhgE5lotfnd7xYaddVzGEg", "fbuyJ5yjBcGI5k2JN5UKvOJPK0AVF2cLzOkOGuem");

}

}
