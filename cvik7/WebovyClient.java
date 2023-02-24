package cvik7;

import java.util.ArrayList;
import java.util.List;

public class WebovyClient {
    private static final int MAX_POOL_SIZE = 10;

    private static List<WebovyClient> pool = new ArrayList<>();
    private boolean inUse = false;

    private WebovyClient() {
    }

    public static synchronized WebovyClient getInstance() {
        WebovyClient client = null;

        if (pool.size() < MAX_POOL_SIZE) {
            client = new WebovyClient();
            pool.add(client);
        } else {
            for (WebovyClient c : pool) {
                if (!c.inUse) {
                    client = c;
                    break;
                }
            }
        }

        if (client != null) {
            client.inUse = true;
            return client;
        }

        return null;
    }

    public synchronized void release() {
        inUse = false;
    }
}
