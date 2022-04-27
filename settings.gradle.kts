rootProject.name = "NetheriteMC"

include("NetheriteMC-api")
project(":NetheriteMC-api").projectDir = file("api")
include("NetheriteMC-server")
project(":NetheriteMC-server").projectDir = file("server")