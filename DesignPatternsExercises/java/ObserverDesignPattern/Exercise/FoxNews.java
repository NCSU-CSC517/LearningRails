public class FoxNews extends Observer {
    public FoxNews(BreakingNewsFeed breakingNewsFeed) {
        __________(5)__________(breakingNewsFeed)
    }

    @Override
    public void sendNotification() {
        System.out.println("Fox Alert: " + breakingNewsFeed.getBreakingNews());
    }
}
