# SpringBatchJobs
This project is spring based which has only one service file as an example on how to call a method/job at a particular time.

By this one can achive similar functionalities like windows scheduler or crontab in linux. 

One has to just put annotations @EnableScheduling in the main project file and @Scheduled(cron commands/time based string) on the method or job which has to be called.

This method ensures to avoid external dependencies like "Quartz Scheduler" or any 3rd party dependencies.
