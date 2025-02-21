Eclipse plug-in mechanism allows us to provide the model data through an extension point. 
Consequences:
•	Business logic and data access implementation are done in a separate plug-in project ( package ) 
•	One or more different implementations may be created and registered 
•	„consumer” can consolidate or filter data from all providers 


1)	Start-Branch auschecken
2)	Create an Extension-Point in the model Plugin-In einen .
a.	The Extension-Point defines a  1-n Element with a provider  Attribut. The Attribute must define a class name which implements the BewegungsdatenModel interface. 
3)	The model plugin offers the Implementation :BewegungsdatenModelImpl 
4)	in the app view read the  ExtensionRegistry and use the extension 
5)	Hint: org.eclipse.core.runtime.IConfigurationElement.createExecutableExtension(String)
6)	Start the application 
