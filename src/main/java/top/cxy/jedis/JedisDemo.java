package top.cxy.jedis;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public class JedisDemo {

    public static void main(String [] args){

        JedisPoolConfig poolConfig = new JedisPoolConfig();
        // 设置最大连接数
        poolConfig.setMaxTotal(50);
        // 设置获取连接的最大等待时间
        poolConfig.setMaxWaitMillis(1000);
        // 开启获取连接时可用性校验，保证拿到的连接都是可用的
        poolConfig.setTestOnBorrow(true);

        // 定义分片信息,添加每个redis分片的IP和端口
        List<JedisShardInfo> shards = new ArrayList<JedisShardInfo>();
        shards.add(new JedisShardInfo("127.0.0.1", 6379));
        shards.add(new JedisShardInfo("127.0.0.1", 6380));

        // 定义分片连接池，指定配置信息和分片地址信息
        ShardedJedisPool shardedJedisPool = new ShardedJedisPool(poolConfig, shards);
        // 从连接池中获取到jedis分片对象
        ShardedJedis shardedJedis = shardedJedisPool.getResource();

        for (int i = 0; i < 100; i++) {
            shardedJedis.set("id"+i,"value"+i);
        }





    }


}
