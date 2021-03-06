USE [db_practice]
GO
/****** Object:  Table [dbo].[tb_quicknew]    Script Date: 12/15/2017 12:25:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_quicknew](
	[编号/id] [smallint] NOT NULL,
	[姓名/name] [nchar](32) NOT NULL,
	[薪水/salary] [money] NOT NULL,
	[入职时间/dateline] [date] NOT NULL,
	[部门/department] [nchar](16) NOT NULL,
	[内部推荐/recommend] [bit] NOT NULL,
	[备注/remarks] [ntext] NULL,
 CONSTRAINT [PK_tb_quicknew] PRIMARY KEY CLUSTERED 
(
	[编号/id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
