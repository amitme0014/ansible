import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()

def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount("amit","amit")
instance.setSecurityRealm(hudsonRealm)
instance.save()
