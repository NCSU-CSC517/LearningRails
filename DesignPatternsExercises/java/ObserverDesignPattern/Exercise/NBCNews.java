public class NBCNews extends Observer {
    public NBCNews(BreakingNewsFeed breakingNewsFeed) {
        __________(6)__________(breakingNewsFeed);
    }

    @Override
    public void sendNotification() {
        System.out.println("NBC Breaking News: " + breakingNewsFeed.getBreakingNews());
    }
}
