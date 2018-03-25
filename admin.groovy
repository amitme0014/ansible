def strategy = new GlobalMatrixAuthorizationStrategy()
strategy.add(Jenkins.ADMINISTER, "myUSERNAME")
instance.setAuthorizationStrategy(strategy)
