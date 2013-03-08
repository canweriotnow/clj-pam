(ns clj-pam.auth
  (:import [net.sf.jpam Pam PamReturnValue]))

(defn simple-auth 
  "Just authenticate a username and password."
  [username, password]
  (. (new Pam) (authenticateSuccessful username password)))

(defn- auth [username password]
  (. (new Pam) (authenticate username password)))


(defn verbose-auth [username password]
  (. toString (auth username password)))
