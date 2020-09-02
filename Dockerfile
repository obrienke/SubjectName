#obrienke/mobile-apps is a build i put on docker hub
#this build is a docker image i could use on gitpod - potentially
#though build not yet fully configured
#FROM obrienke/mobile-apps:latest
FROM gitpod/workspace-full:latest

RUN npm install -g ionic@5.4.0

# EXPOSE 8100
