package uk.ac.uclan.courseexplorer;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Window;
import android.widget.TextView;

public class CEInformation extends Activity {
	
	TextView about;
	
	 public void onCreate(Bundle savedInstanceState) {
	    	
	        super.onCreate(savedInstanceState);
	        
	      //hide the name
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        
	        setContentView(R.layout.information);
	        
	        //set to portrait only
	        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	        
	        about = (TextView) findViewById(R.id.textView1);
	        
	      loadText();
	 }
	 
	    private void loadText(){

	        String s = "Description " + "\n" + "\n" +
	        		"This app is simple: search UCLan’s courses, browse the details, and then enquire direct on 01772 892400 or email cenquiries@uclan.ac.uk" + 
	        		"Features" + "\n" + "\n" +
	        		"Search courses by keyword, institution, qualification, study mode, location (miles or kilometres from postcode at various distances, i.e. 25x)" + "\n" + "\n" +
	        		"Disclaimer" + "\n" + "\n" +
	        		"The use of this app is subject to these terms of use. No other contract is made or can arise from the use of our mobile apps, nor is anything on our mobile apps an offer or the acceptance of an offer." + "\n" + "\n" +
	        		"The apps are for general information and guidance on courses and qualifications that we offer. " + "\n" + "\n" +
	        		"We try to ensure that the content of our mobile apps is accurate and up-to-date, but this cannot be guaranteed. Changes may be made to our courses and qualifications which are not immediately updated within the mobile apps. Entry requirements, number of places and availability or non-availability of courses may change without notice. Please visit www.uclan.ac.uk for the most up-to-date information or contact us on 01772 892400." + "\n" + "\n" +
	        		"We recommend that you thoroughly research the details of each course, entry requirements and the likely demands it may place on you personally and academically before submitting an application." + "\n" + "\n" +
	        		"The content of our mobile apps may be used for personal purposes only. Our written consent is required for any other use."; 

	        about.setMovementMethod(new ScrollingMovementMethod());

	        about.setText(s);
	    }
}
