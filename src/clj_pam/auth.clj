(ns clj-pam.auth
  (:import [net.sf.jpam Pam PamReturnValue PamException]))

(defn simple-auth 
  "Just authenticate a username and password."
  [username, password]
  (let [pam (new Pam)])
  (. pam (authenticateSuccessful username password)))

(defn- auth [username password]
  (. (new Pam) (authenticate username password)))


(defn verbose-auth [username password]
  (. toString (auth username password)))
