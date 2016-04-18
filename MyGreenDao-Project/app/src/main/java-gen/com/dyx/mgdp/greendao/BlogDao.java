package com.dyx.mgdp.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.dyx.mgdp.greendao.Blog;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BLOG".
*/
public class BlogDao extends AbstractDao<Blog, Long> {

    public static final String TABLENAME = "BLOG";

    /**
     * Properties of entity Blog.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Author = new Property(1, String.class, "author", false, "AUTHOR");
        public final static Property Tab = new Property(2, String.class, "tab", false, "TAB");
        public final static Property Comment = new Property(3, String.class, "comment", false, "COMMENT");
        public final static Property Date = new Property(4, java.util.Date.class, "date", false, "DATE");
    };


    public BlogDao(DaoConfig config) {
        super(config);
    }
    
    public BlogDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BLOG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"AUTHOR\" TEXT NOT NULL ," + // 1: author
                "\"TAB\" TEXT NOT NULL ," + // 2: tab
                "\"COMMENT\" TEXT NOT NULL ," + // 3: comment
                "\"DATE\" INTEGER);"); // 4: date
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BLOG\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Blog entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getAuthor());
        stmt.bindString(3, entity.getTab());
        stmt.bindString(4, entity.getComment());
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(5, date.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Blog readEntity(Cursor cursor, int offset) {
        Blog entity = new Blog( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // author
            cursor.getString(offset + 2), // tab
            cursor.getString(offset + 3), // comment
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)) // date
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Blog entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAuthor(cursor.getString(offset + 1));
        entity.setTab(cursor.getString(offset + 2));
        entity.setComment(cursor.getString(offset + 3));
        entity.setDate(cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Blog entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Blog entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}