package homeautomation;

class SecurityActivateCommand implements Command {  
    private SecuritySystem security;  

    public SecurityActivateCommand(SecuritySystem security) {  
        this.security = security;  
    }  

    public void execute() {  
        security.activate();  
    }  
}  