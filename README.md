# mTLS Client and Server

This is a basic server and client application to study mTLS and how certificates (CA, server and client) works.

The server was made with clojure (because why not?), docker and nginx. It's nginx the responsable for ensuring the mTLS.

The client application again is made in clojure, with a basic get request configured with a valid keystore (in pkcs12).

