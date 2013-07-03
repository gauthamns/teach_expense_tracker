<h3>A simple expense tracker application written for Blrdroid teach programs.</h3>

The project is divided into 4 sections (4 mini projects) together constituting one Expense tracker project. 

Section 1:
  Add expense screen and display the contents submitted in a toast message.
  Concepts: Activity lifecycle, simple layout, toast messages.

Section 2:
  2nd screen showing the expense added.
  Concepts: Intents and passing data between activities.

Section 3: 
  Store expenses in a database.
  Concepts: Creating Sqlite db, Wiring the connection, Sqlite Helper, Inserting database records.

Section 4:
  Retrieving data from Database and displaying in a list view. Open detail screen of a record from the list view.
  Concepts: List view, Binding db with list view, Adapter passing values b/w intents.
  

How to use this project:
  Master branch will have the Expense tracker project and sections are maintained in separate branches (can also be maintained with the help of tags but won't be able to make changes at some point of time).
Branches (Names are self explanatory):
section1
section2
section3
section4
master
bleeding-edge (Goes further. For enthusiasts)

How to contribute:
  As you might have observed from the above, sections should be taken up in the same order. And hence contribution also will happen in the same order.
  
What does that mean?
  You can only merge a branch with its previous branch. If you make any changes to section1, it should be merged with section2 and goes the order.
section1 -> section2
section2 -> section3
section3 -> section4
section4 -> master
So if you make any changes to section1, make sure you merge it with section2, and then section2 with section3, section3 with section4 and section4 to master.
This will allow us to maintain the continuity of the project from one section to another.
