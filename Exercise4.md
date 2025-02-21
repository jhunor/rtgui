Declare, implement and use a service in your application. The service is dedicated to providing the data model. 
The goal is that the application accesses the model data through the service instead of through an extension 

1)	Delete the previously created extension/extension point 
2)  In your application initialize the available service through the 	Service Lifecycle Manager: 
	a.	Dependency Injection Util
	b.	Service Lifecycle Manger
	c.	Set the active  Environment to the default one 

3)	Transform the BewegungsdatenModelImpl into a service ( 	IServiceProvider) 
4)	In your list view get the service via  @Inject
	a.	(Tipp: RcsExecutableExtensionFactory)
5)	Run the application 
