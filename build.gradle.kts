plugins {
    java
    id("com.github.weave-mc.weave") version "8b70bcc707"
}

group = "me.zircta"
version = "1.0.5"

minecraft.version("1.8.9")

repositories {
    maven("https://jitpack.io")
    maven("https://repo.spongepowered.org/maven/")
}

dependencies {
    compileOnly("com.github.weave-mc:weave-loader:6a9e6a3245")
}

tasks.compileJava {
    options.release.set(11)
}
