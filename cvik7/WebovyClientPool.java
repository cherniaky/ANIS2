package cvik7;

import java.util.ArrayList;
import java.util.List;

public class WebovyClientPool {
    private static final int MAX_POOL_SIZE = 10;

    private List<WebovyClient> pool = new ArrayList<>();

    private WebovyClientPool() {
        for (int i = 0; i < MAX_POOL_SIZE; i++)
            pool.add(new WebovyClient());
    }

    public WebovyClient getClient() {
        if (pool.isEmpty()) {
            return new WebovyClient();
        } else {
            WebovyClient client = pool.get(0);
            pool.remove(0);
            return client;
        }
    }

    public void closeClient(WebovyClient client) {
        if (pool.size() >= MAX_POOL_SIZE) {
            return;
        }
        this.pool.add(client);
    }
}
