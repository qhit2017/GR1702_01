USE [db_worker1]
GO
/****** Object:  Table [dbo].[sp_worker1]    Script Date: 12/17/2017 19:42:14 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sp_worker1](
	[id] [int] NOT NULL,
	[name] [nchar](10) NOT NULL,
	[salary] [money] NOT NULL,
	[dateline] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nchar](10) NOT NULL,
	[remark] [ntext] NOT NULL,
 CONSTRAINT [PK_sp_worker1] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
