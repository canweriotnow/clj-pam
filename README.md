# clj-pam

clj-pam is a Clojure wrapper for the JPam library, providing Linux PAM authentication for Clojure apps.

This is the first step an effort to build up in Clojure functionality I currently have in production in Ruby: see also [rpam-ruby19](https://github.com/canweriotnow/rpam-ruby19)

## Usage

The most basic usage is simply:

```clojure

(use 'clj-pam.auth)

(simple-auth "username" "password")
```

More examples to follow.

## TODO

JPam is capable of much more than simple PAM auth. Still need to implement the jaas JpamLoginModule functionality. Someday.

## License

Copyright © 2013 Jason Lewis

Distributed under the Eclipse Public License, the same as Clojure.
