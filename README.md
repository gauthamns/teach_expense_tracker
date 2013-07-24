<h3>A simple expense tracker application written for Blrdroid teach programs.</h3>

<b>Prerequisites For Android WorkShop</b><br>
<ol>
<li>
All the attendees must have basic java programming knowledge.</li>
<li>All the systems must be connected to internet.</li>
<li>The lab which is used to conduct the workshop must have a projector.</li>
<li>The session speaker must be provided with a collar mic.</li>
<li>Setting up the Development Environment:
All the systems used by attendees must have jdk 1.6 installed.<br>
<strong>Installation on Windows</strong><br>
http://docs.oracle.com/javase/7/docs/webnotes/install/windows/jdk-installation-windows.html#requirements
<strong>Installation on Linux</strong><br>
http://docs.oracle.com/javase/7/docs/webnotes/install/linux/linux-jdk.html<br><br>

The above links provide all the details regarding system requirements and setting up of jdk1.6 on your windows<br>
<b>Linux machine.</b><br>
After successful installation of jdk to check if java is now installed on your machine or not go to terminal and type java and enter it will give the details of the jdk installed.
</li>

<li>All the systems used by attendees must be having an IDE  (Eclipse/ Android studio) set up and running with a sample hello world project.</li>
<li>Eclipse ADT download link - http://developer.android.com/sdk/index.html
Android Studio Download link - http://developer.android.com/sdk/installing/studio.html</li>
<li>Now let us create a sample application and run it.
Creating your first Application
http://developer.android.com/training/basics/firstapp/creating-project.html
Running your First Application
http://developer.android.com/training/basics/firstapp/running-app.html
Now you can see Hello world in the emulator and your system is ready for workshop. 
</li>
</ol>

The project is divided into 4 sections (4 mini projects) together constituting one Expense tracker project. 

<b>Section 1:</b><br/>
  Add expense screen and display the contents submitted in a toast message.
  Concepts: Activity lifecycle, simple layout, toast messages.

<b>Section 2:</b><br/>
  2nd screen showing the expense added.
  Concepts: Intents and passing data between activities.

<b>Section 3:</b><br/> 
  Store expenses in a database.
  Concepts: Creating Sqlite db, Wiring the connection, Sqlite Helper, Inserting database records.

<b>Section 4:</b><br/>
  Retrieving data from Database and displaying in a list view. Open detail screen of a record from the list view.
  Concepts: List view, Binding db with list view, Adapter passing values b/w intents, using menu for going to list.
  

How to use this project:
  Master branch will have the Expense tracker project and sections are maintained in separate branches (can also be maintained with the help of tags but won't be able to make changes at some point of time).
Branches (Names are self explanatory):<br/>
section1<br/>
section2<br/>
section3<br/>
section4<br/>
master<br/>
bleeding-edge (Goes further. For enthusiasts)

<h4>How to contribute:</h4>
  As you might have observed from the above, sections should be taken up in the same order. And hence contribution also will happen in the same order.
  
<b>What does that mean?</b>
  You can only merge a branch with its previous branch. If you make any changes to section1, it should be merged with section2 and goes the order.<br/>
section1 -> section2<br/>
section2 -> section3<br/>
section3 -> section4<br/>
section4 -> master<br/>
So if you make any changes to section1, make sure you merge it with section2, and then section2 with section3, section3 with section4 and section4 to master.
This will allow us to maintain the continuity of the project from one section to another.

<h4>Things to consider</h4>
In the list view, date is shown as long value. Showing proper date will require the use of ViewBinder and might be given as an advanced exercise.
Use of CustomViewBinder here: http://enjoyandroid.wordpress.com/2012/03/12/customizing-simple-cursor-adapter/ <br/>
We can use a DatePicker to indicate the date of the expense. Time and effort(although not significant) for adding date field makes it an advanced exercise.
 
<h4>How to use(For Blrdroid teach training)</h4>
Clone the project using git clone git@github.com:gauthamns/teach_expense_tracker.git<br/>
Take up sections one by one. While teaching each section, checkout the corresponding section.<br/>
Example: While teaching section 1, git checkout section1<br/>
While teaching section 2, git checkout section2<br/>


