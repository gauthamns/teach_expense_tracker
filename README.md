<h3>A simple expense tracker application written for Blrdroid teach programs.</h3>

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


