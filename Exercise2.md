
Business logic and impelmentation details of obtaining model data should be abstracted away as much as possible. Plug-ins can export and import packages, this provides a mechanism for encapsulating internal details and sharing only common interfaces.

In this exercise our goal is to move the dummy model data into a separate plugin. To do this we need to: 
•	Have a separate plug-in project 
•	Declare the necessary interfaces 
•	Export and import the necessary packages (Plugin Configuration in the MANIFEST) 
