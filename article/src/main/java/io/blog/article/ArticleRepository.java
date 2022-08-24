/**
 * Created by IntelliJ IDEA.
 * User: Cangue.Jamba
 * Project name: microservices-docker-container
 */
package io.blog.article;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article findArticleById(Long articleId);
}

