package teste.cd;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	FileInputStream serviceAccount = new FileInputStream("C:\\Users\\Esc\\Documents\\GitHub\\CDA-1\\teste-f2c44-firebase-adminsdk-367p3-55eaee5a6e.json");

    	FirebaseOptions options = new FirebaseOptions.Builder()
    	    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
    	    .setDatabaseUrl("https://teste-f2c44.firebaseio.com/")
    	    .build();

    	FirebaseApp.initializeApp(options);
    }
}
