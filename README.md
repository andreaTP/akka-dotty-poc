## Akka Actor module compiled with Dotty

This is the output of a few ours at Scala Spree 2019 at Scala Days.

Thanks to @nicolasstucki for the support!

# Usage

There is  a trivial actor ping-pong implemented in the tests that you can run via:
```
sbt test
```

You can publish local and use it via:
```
sbt publishLocal
```

# Caveats

This was a quick and dirty port most of the changes from current akka master branch are marked with a comment starting with:

```
// DOTTY
```

The Logging system is basically disabled.
